// package test;

// import java.util.List;

// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.Mockito;
// import org.mockito.MockitoAnnotations;
// import org.mockito.runners.MockitoJUnitRunner;

// import Trade.NameService;

// @RunWith(MockitoJUnitRunner.class)
// public class NameTest {
// NameService nameServiceMock;

// @Before
// void setUp() {
// MockitoAnnotations.initMocks(this);
// nameServiceMock = Mockito.mock(NameService.class);
// Mockito.when(nameServiceMock.getAllNamesFromDatabase())
// .thenReturn(List.of("Mary", "Emmanuel", "Jojoe", "Enock", "Maggie",
// "Mavis"));
// }

// @Test
// void testNames() {
// System.out.println("Name Service Tests");
// }

// }
