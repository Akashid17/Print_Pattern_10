
#include <iostream>

using namespace std;

class PatternX
{
    public:
        void Display(int,int);
};

void PatternX::Display(int iNo1, int iNo2)
{
    if(iNo1 < 0)
    {
        iNo1 = -iNo1;
    }

    if(iNo2 < 0)
    {
        iNo2 = -iNo2;
    }

    if(iNo1 != 0 && iNo2 != 0)
    {
        for(int i = 0; i < iNo1; i++)
        {
            for(int j = 0; j < iNo2; j++)
            {
                if(j%2 != 0)
                {
                    cout<<"#\t";
                }
                else
                {
                    cout<<"*\t";
                }
            }
            cout<<endl;
        }
    }
    else
    {
        return;
    }
} 

int main()
{
    int iValue1 = 0, iValue2 = 0;

    cout<<"Enter Count of Rows and Columns"<<endl;
    cin>>iValue1>>iValue2;

    PatternX pobj;
    pobj.Display(iValue1,iValue2);


    return 0;
}