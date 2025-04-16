package com.InventoryManager.models.users;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    @Id
    private String id;

    private String name;

    private String email;

    private String password;

    private ROLE role;

    public static enum ROLE {
        ADMIN,
        USER
    }
}
