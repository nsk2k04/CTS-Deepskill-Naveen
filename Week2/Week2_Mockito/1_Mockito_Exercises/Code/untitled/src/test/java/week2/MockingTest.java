package week2;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockingTest {

    @Test
    void testMockListSize() {
        List<String> mockedList = mock(List.class);
        when(mockedList.size()).thenReturn(5);
        assertEquals(5, mockedList.size(), "Size should be mocked to 5");
    }
}