Import java.util.Scanner;

Class EBBill
{
    Int consumerNo;
    String consumerName;
    Int previousReading, currentReading, units;
    String connectionType;
    Double amount = 0;

    Void getInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(“Enter Consumer Number: “);
        consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print(“Enter Consumer Name: “);
        consumerName = sc.nextLine();

        System.out.print(“Enter Previous Reading: “);
        previousReading = sc.nextInt();

        System.out.print(“Enter Current Reading: “);
        currentReading = sc.nextInt();

        units = currentReading – previousReading;

        sc.nextLine();
        System.out.print(“Enter Connection Type (Domestic/Commercial): “);
        connectionType = sc.nextLine();
    }

    Void calculateBill()
    {
        If(connectionType.equalsIgnoreCase(“Domestic”))
        {
            If(units <= 100)
            {
                Amount = 0;
            }
            Else if(units <= 200)
            {
                Amount = units * 2;
            }
            Else if(units <= 500)
            {
                Amount = units * 4;
            }
            Else
            {
                Amount = units * 6;
            }
        }
        Else if(connectionType.equalsIgnoreCase(“Commercial”))
        {
            If(units <= 100)
            {
                Amount = units * 2;
            }
            Else if(units <= 200)
            {
                Amount = units * 4;
            }
            Else if(units <= 500)
            {
                Amount = units * 6;
            }
            Else
            {
                Amount = units * 7;
            }
        }
        Else
        {
            System.out.println(“Invalid Connection Type”);
            Return;
        }

        displayBill();
    }

    Void displayBill()
    {
        System.out.println(“\n------ EB BILL ------“);
        System.out.println(“Consumer No : “ + consumerNo);
        System.out.println(“Consumer Name : “ + consumerName);
        System.out.println(“Units Consumed: “ + units);
        System.out.println(“Connection : “ + connectionType);
        System.out.println(“Bill Amount : Rs.” + amount);
    }

    Public static void main(String args[])
    {
        EBBill obj = new EBBill();
        Obj.getInput();
        Obj.calculateBill();
    }
