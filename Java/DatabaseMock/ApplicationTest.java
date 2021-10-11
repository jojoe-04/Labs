package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import DatabaseMock.DatabaseDAO;
import DatabaseMock.NetworkDAO;
import DatabaseMock.RecordService;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
    @InjectMocks
    RecordService recordService;

    @Mock
    DatabaseDAO databaseMock;

    @Mock
    NetworkDAO networkMock;

    private boolean saved;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        saved = recordService.save("temp.txt");

    }

    @Test
    public void saveTest() {
        saved = recordService.save("temp.txt");
        assertEquals(true, saved);

        // verify(databaseMock, times(1)).save("temp.txt");
        // verify(networkMock, times(1)).save("temp.txt");
    }
}