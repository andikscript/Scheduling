package com.andikscript.scheduling.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
//@EnableAsync
public class ScheduleImpl implements ScheduleService {

    @Override
//    @Scheduled(fixedDelay = 60000) // 1000 = 1 detik
    // akan dijalankan setiap 1 detik dimulai dari running pertama kali
    public void fixedDelay() {
        System.out.println("fixed delay - " + System.currentTimeMillis() / 1000);
    }

    @Override
    @Scheduled(fixedDelay = 1000, initialDelay = 4000)
    // akan dijalankan setiap 1 detik akan tetapi untuk running pertama kali setelah 4 detik
    public void fixedDelayInitial() {
        System.out.println("fixed delay initial - " + System.currentTimeMillis() / 1000);
    }

    @Override
//    @Scheduled(fixedRate = 60000)
    // akan dijalankan tiap 1 detik dan eksekusi selanjutnya menunggu sebelumnya selesai
    public void fixedRate() {
        System.out.println("fixed rate - " + System.currentTimeMillis() / 1000);
    }

    @Override
//    @Async
//    @Scheduled(fixedRate = 1000)
    // akan dijalankan tiap 1 detik dan eksekusi selanjutnya tidak menunggu sebelumnya selesai (parallel)
    public void fixedRateAsync() {
        System.out.println("fixed rate async - " + System.currentTimeMillis() / 1000);
    }
}
