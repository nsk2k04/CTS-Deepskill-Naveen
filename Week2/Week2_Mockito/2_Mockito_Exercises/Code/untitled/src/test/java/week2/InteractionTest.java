package week2;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.mockito.Mockito.*;

public class InteractionTest {

    @Test
    void testInteraction() {
        List<String> mockedList = mock(List.class);

        // Use the mock object
        mockedList.add("Machii");
        mockedList.clear();

        // Verify interactions
        verify(mockedList).add("Machii");
        verify(mockedList).clear();
    }
}
