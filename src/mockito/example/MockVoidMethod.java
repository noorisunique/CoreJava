package mockito.example;

public class MockVoidMethod {

}

	@Test
	public void testUpdateNameWithDoNothingVerifyRepositoryCall() {
		doNothing().when(mockedUserRepository).updateName(anyLong(), anyString());

		userService.updateName(1L, "void mock test");

		verify(mockedUserRepository, times(1)).updateName(1L, "void mock test");
	}

}