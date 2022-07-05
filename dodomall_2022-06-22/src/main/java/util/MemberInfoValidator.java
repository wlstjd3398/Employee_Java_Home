package util;

public class MemberInfoValidator {
	// 아이디가 올바른지 검증하는 메서드
	public boolean idValidator(String id) {
		boolean result = false;
		
		if(id == null) {
			result = true;
		} else if(id.trim().length() == 0) {
			result = true;
		} else if(id.length() < 4 || id.length() > 10) {
			result = true;
		}
		
		// 소문자 목록
		char[] lowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		// 대문자 목록
		char[] upperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'I', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		// 숫자 목록
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		// 소문자 포함 여부
		boolean existLowerCase = false;
		// 대문자 포함 여부
		boolean existUpperCase = false;
		// 숫자 포함 여부
		boolean existNumber = false;
		
		// 문자열의 indexOf 메서드가 어떤 메서드인지 찾아보고
		// indexOf와 위 배열, 변수를 활용해서 대소문자, 숫자 하나 이상 포함 여부를 파악하세요.
		// indexOf(문자) -> 그 문자가 문자열 안에 있다면 문자열 내 문자의 인덱스 번호를 반환
		//                 그 문자가 문자열 안에 없다면 -1을 반환
		for(int i=0; i<lowerCase.length; i++) {
			char nth = lowerCase[i];
			
			if(id.indexOf(nth) != -1) {
				existLowerCase = true;
				break;
			}
		}
		
		for(int i=0; i<upperCase.length; i++) {
			char nth = upperCase[i];
			
			if(id.indexOf(nth) != -1) {
				existUpperCase = true;
				break;
			}
		}
		
		for(int i=0; i<number.length; i++) {
			char nth = number[i];
			
			if(id.indexOf(nth) != -1) {
				existNumber = true;
				break;
			}
		}
		
		if(!existLowerCase) {
			result = true;
		} else if(!existUpperCase) {
			result = true;
		} else if(!existNumber) {
			result = true;
		}
		
		return result;
	}
	
	// 비밀번호가 올바른지 검증하는 메서드
	public boolean pwValidator(String pw) {
		
		return false;
	}
	
	// 이름이 올바른지 검증하는 메서드
	// 규칙 : 3자만 가능, 한글만 가능
	public boolean nameValidator(String name) {
		
		
		return false;
	}
	
	// 규칙 : 010-1111-2222 와 같은 형식만 가능
	//       각 자리 마다 하이픈(-)이 반드시 있어야하고
	//       첫 자리는 3자, 중간 자리는 4자, 마지막 자리는 4자여야함
	public boolean telValidator(String tel) {
		// 문자열의 split() 메서드를 활용
		
		return false;
	}
	
	// 규칙 : 특별시, 광역시, 시, 도만 가능
	// 서울특별시
	// 인천광역시
	// 제주특별자치도
	// ...
	public boolean addrValidator(String addr) {
		String[] list = {"서울특별시", "인천광역시", "..."};
		
		for(String nth : list) {
			if(addr.equals(nth)) {
				// ...
			}
		}
		
		return false;
	}
	
	public boolean emailValidator(String email) {
		return false;
	}
}


