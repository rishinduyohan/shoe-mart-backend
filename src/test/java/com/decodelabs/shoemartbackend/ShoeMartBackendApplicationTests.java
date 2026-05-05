package com.decodelabs.shoemartbackend;

import org.junit.jupiter.api.Test;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ShoeMartBackendApplicationTests {

    @Test
    void contextLoads() {
        assertNotNull(new ShoeMartBackendApplication());
    }

}
