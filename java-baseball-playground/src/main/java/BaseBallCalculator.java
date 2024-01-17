public class BaseBallCalculator {

    private final BaseBallResult baseBallResult = new BaseBallResult();

    // 계산과 결과 반환
    public BaseBallResult play(
            BaseBallNumbers computerBaseBallNumbers,
            BaseBallNumbers userBaseBallNumbers
    ) {
        for (int position = 0; position < userBaseBallNumbers.size(); position++) {
            BaseBallNumber userBaseBallNumber = userBaseBallNumbers.get(position);

            if (isStrike(computerBaseBallNumbers, userBaseBallNumber, position)) {
                baseBallResult.record(BaseBallStatus.STRIKE);
            } else if (isBall(computerBaseBallNumbers, userBaseBallNumber, position)) {
                baseBallResult.record(BaseBallStatus.BALL);
            }
        }
        return baseBallResult;
    }

    // 스트라이크인지 아닌지 확인
    private boolean isStrike(
            BaseBallNumbers computerBaseBallNumbers,
            BaseBallNumber userBaseBallNumber,
            int position
    ) {
        return computerBaseBallNumbers.isStrike(userBaseBallNumber, position);
    }

    // 볼인지 아닌지 확인
    public boolean isBall(
            BaseBallNumbers computerBaseBallNumbers,
            BaseBallNumber userBaseBallNumber,
            int position
    ) {
        return computerBaseBallNumbers.isBall(userBaseBallNumber) && !computerBaseBallNumbers.isStrike(userBaseBallNumber, position);
    }

}
