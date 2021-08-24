package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
public class User {
    private  String name;
    private int age;
}
