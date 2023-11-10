package com.github.krezovic.openapireport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "user-v1", description = "User v1 API")
@RestController
@AllArgsConstructor
@Validated
@RequestMapping(value = "users/v1")
public class UserRest {
    @Operation(summary = "Find Users based on filter criteria")
    @GetMapping
    public User get() {
        return new User();
    }
}
