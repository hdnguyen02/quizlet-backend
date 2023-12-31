package hdnguyen.dto;


import hdnguyen.dto.auth.LabelDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicDto {
    private String name;
    private List<LabelDto> labels;
}
