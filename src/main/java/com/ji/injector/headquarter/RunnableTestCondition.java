/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.headquarter;

import java.util.Optional;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import static org.junit.platform.commons.support.AnnotationSupport.findAnnotation;

/**
 *
 * @author sommovir
 */
public class RunnableTestCondition implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        Optional<ConditionToExecute> annotation = findAnnotation(context.getElement(), ConditionToExecute.class);

        if (annotation.isPresent()) {
            Class<?> classToCheck = annotation.get().classToCheck();
            Exercise executingTestAnn = classToCheck.getDeclaredAnnotation(Exercise.class);
            if (executingTestAnn != null) {

                if (!executingTestAnn.testEnabled()) {
                    System.out.println("Test on exercise: " + executingTestAnn.name() + " is [DISABLED]");
                    System.out.println("+-----------------------------------------------------+");
                    return ConditionEvaluationResult.disabled("Test on class: " + context.getElement().toString() + " is DISABLED");
                } else {
                    System.out.println("Test on exercise:" + executingTestAnn.name() + " is [ENABLED]");
                    System.out.println("+-----------------------------------------------------+");
                    return ConditionEvaluationResult.enabled("Test on class: " + context.getElement().toString() + " is ENABLED");
                }

            }
        }

        return ConditionEvaluationResult.enabled("No AssumeConnection annotation found. Continuing test.");
    }

}
