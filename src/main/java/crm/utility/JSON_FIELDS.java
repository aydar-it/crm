package crm.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum JSON_FIELDS {
    NAME("name"),
    COUNT("count"),
    PRICE("price"),
    DATE("date");

    @Getter
    String title;
}
