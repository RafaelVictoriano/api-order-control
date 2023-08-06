package com.br.apiordercontrol.util;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import io.swagger.v3.core.util.Json;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonUtilTest {

    private static final String MESSAGE = """
            {"clientId":11,"products":[{"productId":230,"quantity":22},{"productId":90,"quantity":10}]}
            """;

    @Test
    void shouldConvertMessageToOrderRequestDTO() {
        Assertions.assertDoesNotThrow(() -> JsonUtil.toObject(MESSAGE, OrderRequestDTO.class));
    }
}
