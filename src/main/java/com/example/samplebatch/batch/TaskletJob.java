//package com.example.SampleBatch.batch;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Slf4j
//@RequiredArgsConstructor
//@Configuration
//public class TaskletJob {
//
//    private final JobBuilder jobBuilder;
//    private final StepBuilder stepBuilder;
//
//    @Bean
//    public Job taskletJob_batchBuild(){
//        return jobBuilder.getClass("taskletJob")
//            .start(stepBuilder)
//    }
//
//    @Bean
//    public Step taskletJob_step1(){
//        return stepBuilder.getClass("taskletJob_step1")
//                .tasklet((a,b) -> {
//                    log.debug("-> job -> [step1]");
//                    return RepeatStatus.FINISHED;
//                }
//    }
//}
