package works.tripod.icanwait.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @PostMapping(path = "/search", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> search(@RequestBody(required = false) SearchInput searchInput) {
        SearchOutput searchOutput = new SearchOutput(searchInput.getTelNo(), searchInput.getZipCode(), "Y");
        return ResponseEntity.ok(searchOutput);
    }

}
