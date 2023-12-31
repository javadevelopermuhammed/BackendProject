package com.project.payload.request.business;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ChooseLessonProgramWithId {

    @NotNull(message = "Please select lesson program")
    @Size(min=1, message = "lessons must not be empty")
    private Set<Long> lessonProgramId;
}
