package digit;

public class digits {
    public Digits(int num)
    {
        digitList = new ArrayList1();
        if (num == 0)
        {
            digitList.add(new Intefer(0));
        }
        while (num > 0)
        {
            digitList.add(0, new Integer(num%10));
            num /= 10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size()-1; i++)
        {
            if (digitList.get(i).intValue() >= digitList.get(i+1).intValuse())
            {
                return false;
            }
        }
        return true;
    }
}
