package com.blog.app.blog.entities;

import lombok.*;
import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "uploaded_at", nullable = false)
    private LocalDateTime uploadedAt;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @Column(name = "tags", nullable = false)
    private List<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
