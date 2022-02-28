
def Display(iNo1,iNo2):

    if iNo1 < 0:
        iNo1 = -iNo1
    
    if iNo2 < 0:
        iNo2 = -iNo2

    if iNo1 != 0 and iNo2 != 0:

        for x in range(iNo1):
            for y in range(iNo2):
                if(y%2 == 0):
                   print("*",end="\t")
                else:
                    print("#",end="\t")
            print() 

def main():

    print("Enter Count of Rows and Columns")
    iValue1 = int(input())
    iValue2 = int(input())

    Display(iValue1,iValue2)

if __name__ == "__main__":
    main()