package com.example.SpringBootCRUD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
        @jakarta.persistence.Id
        @Id
        private int id;
        private String name;
        private String address;
}
