int testNum(int input)
{
    extern int guess; // declare extern variable

    int result = 0;

    if (input > guess)
        result = -1;
    else if (input < guess)
        result = 1;
    else
        result = 0;

    return result;
}