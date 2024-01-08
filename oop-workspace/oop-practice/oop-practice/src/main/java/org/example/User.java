package org.example;

/**
 *  테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음
 *  위의 조건을 위해서 아래 코드를 작성
 */

public class User {
    private String password;

    /**
     * 컨트롤 할 수 없는 부분을 외부로부터 주입을 받는다.
     * interface
     */
    public void initPassword(PasswordGenerator passwordGenerator) {
        // As-is (강한 결합 - import 필요)
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        // String password = randomPasswordGenerator.generatePassword();

        // To-be (약한 결합 - interface 이용 import 불필요)
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12 ) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
