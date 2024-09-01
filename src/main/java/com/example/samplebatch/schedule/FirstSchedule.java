package com.example.samplebatch.schedule;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@RequiredArgsConstructor
public class FirstSchedule {
    private final JobLauncher jobLauncher;
    private final JobRegistry jobRegistry;


    // cron : 배치 실행 시간 설정
    // 10 * * * * * 매분 10초에 배치 실행
    @Scheduled(cron = "10 * * * * *", zone = "Asia/Seoul")
    public void runFirstJob() throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");   // 해당 작업 실행 시간을 추출
                                                                                            // hh : 12시간, HH : 24시간
        String date = dateFormat.format(new Date());

        JobParameters jobParameters = new JobParametersBuilder()
                .addString("date", date)    // 문자열 파라미터 date 추가
                .toJobParameters();             // build() 메서드와 그 역할이 같지만 네이밍을 달리 해준 것임.
        jobLauncher.run(jobRegistry.getJob("firstJob"), jobParameters);
    }
}
