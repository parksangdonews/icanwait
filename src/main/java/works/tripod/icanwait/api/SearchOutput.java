package works.tripod.icanwait.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class SearchOutput {

    private String telNo = "";
    private String zipCode = "";
    private String waitYn = "";

}
