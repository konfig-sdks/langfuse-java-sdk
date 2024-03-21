package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://cloud.langfuse.com";
        
        // Configure HTTP basic authorization: BasicAuth
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        Langfuse client = new Langfuse(configuration);
        assertNotNull(client);
    }
}
