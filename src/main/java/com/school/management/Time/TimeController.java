package com.school.management.Time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/time")
public class TimeController {
        private LocalTime now;

        public void updateCurrentTime() {
            now = LocalTime.now();
        }

    @GetMapping("/now")
    public String getCurrentTime() {
        LocalTime now = LocalTime.now();
        return "Current TIme is " + now;
    }
}
