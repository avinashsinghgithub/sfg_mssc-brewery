package guru.springframework.msscbrewery.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Getter
@Setter
@Builder
public class CustomerDto {
    UUID id;
    @NotBlank
    @Size(min = 3,max = 100)
    String name;
}
