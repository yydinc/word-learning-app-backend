package com.ytuce.wordlearningapp.controllers.user.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class UserProfileResponse {
    private String email;
    private String name;
}
