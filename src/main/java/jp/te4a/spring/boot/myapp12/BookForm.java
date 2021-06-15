package jp.te4a.spring.boot.myapp12;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@NoArgsConstructor
public class BookForm {
  private Integer id ;
  @NotNull
  @Size(min = 3)
  private String title;
  @Size(min = 3, max = 20)
  private String writter;
  @Writter(ok="東北タロウ")
  private String publisher;
  @Min(0)
  private Integer price;
}