package com.github.krezovic.openapireport;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Schema(description = "Properties for creation of a user")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Pattern(regexp = "^(?=.{4,256}$)(?:[a-zA-Z\\d]+(?:[.\\-_@][a-zA-Z\\d])*)+$", message = "{user.validation.username_invalid}")
    @Schema(description = "User name of a given user", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "")
    private String username;

    @Pattern(regexp = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "{user.validation.email_invalid}")
    @Schema(description = "E-mail of a given user", requiredMode = Schema.RequiredMode.REQUIRED, defaultValue = "")
    private String email;
}
