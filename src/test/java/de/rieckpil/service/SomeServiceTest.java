package de.rieckpil.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.rieckpil.service.SomeDao;
import com.rieckpil.service.SomeService;

@RunWith(MockitoJUnitRunner.class)
public class SomeServiceTest {

  @InjectMocks
  private SomeService cut;

  @Mock
  private SomeDao mockedDao;

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  @Test
  public void testDoFooWithInputGreater10ShouldThrowException() {

    exception.expect(RuntimeException.class);
    cut.doFoo(20);

  }

  @Test
  public void testDoFooWithInputEqual10ShouldReturn11() {

    int result = cut.doFoo(10);

    assertEquals(11, result);
    verify(mockedDao).doBar();

  }
}
