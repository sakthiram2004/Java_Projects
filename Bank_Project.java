import java.io.*;
class Account
{
protected int accnumber;
protected double balance;
Account(int accnumber,double balance)
{
this.accnumber=accnumber;
this.balance=balance;
}
Account()
{
accnumber = 0;
balance = 0.0;
}
}
class SBAccount extends Account
{
SBAccount(int ano,double balance)
{
  super(ano,balance);
System.out.println("Your new SBAccount is opened with a balance of "+balance+ "and its account number of "+ano);
}
void deposit(double amnt)
{
System.out.println("Exsisting Balance:"+balance);
  if(amnt >= 0)
{
   
      balance = balance + amnt;
       System.out.println("Balance after deposit:"+balance);
}
else
       System.err.println("Amount is negative");
}
void withdraw(double amnt)
{
System.out.println("Exsisting Balance:"+balance);
 if(balance-amnt>=1000)
{
balance=balance-amnt;
System.out.println("withdrawl Amount="+amnt);
System.out.println(" Remaining Balance ="+balance); 
}
else 
System.out.println("Balance is insufficient for this amount"+amnt);
}
void calc_interest()
{
System.out.println("Exsisting Balance:"+balance);
balance = balance*4/100;
System.out.println("New Balance"+balance);
}
}
class FDAccount extends Account
{
int period;
FDAccount(int acno,int period,double amnt)
{
super(acno,amnt);
this.period=period;
System.out.println("new FDAccount is opened with a deposit of "+amnt+"for the period of"+ period); 
} 
double calc_interest()
{
return period*balance*8.25/100;
}
void close()
{
System.out.println("Amount Deposited ="+balance+"for the period of "+period);
balance = balance + calc_interest();
System.out.println("FDAccount is closed with balance"+balance);
}
}
class Customer
{
int cust_id;
String name,address;
SBAccount sb;
FDAccount fd;
static int accno = 1001;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Customer(int cust_id,String name,String address)
{
this.cust_id=cust_id;
this.name=name;
this.address=address;
}
void createAccount(int type)throws IOException
{
if(type==1)
{
System.out.println("Enter initial amount to open SBAccount :");
double amnt = Double.parseDouble(br.readLine());
sb = new SBAccount(accno,amnt);
accno++;
}
else if(type==2)
 {
System.out.println("Enter deposit and period to open a FDAccount:");
double amnt = Double.parseDouble(br.readLine());
int period = Integer.parseInt(br.readLine());
fd = new FDAccount(accno,period,amnt);
accno++;
 }
else
{
System.out.println("Invalid choice");
}
}
void transaction(int type) throws IOException
{
if(type==1)
{
System.out.println("Enter the amount wants to be deposit:");
double amnt=Double.parseDouble(br.readLine());
sb.deposit(amnt);
}
else if(type==2)
{
System.out.println("Enter the amount for withdrawal:");
double amnt=Double.parseDouble(br.readLine());
sb.withdraw(amnt);
}
else if(type==3)
sb.calc_interest();
else if(type == 4)
fd.close();
else
System.out.println("Invalid choice");
}
}

class BankDemo
{
public static void main(String arg[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Customer c[] = new Customer[5];
int id,i=0,op,ych;
do
{
System.out.println("SB Account -- 1");
System.out.println("FD Account -- 2");
System.out.println("Exit -- 3");
System.out.println("Please enter a valid choice :");
op = Integer.parseInt(br.readLine());
switch(op)
{
case 1:
do
{
System.out.println("To Opening new SB Account press ----- 1");
System.out.println("To Deposit press---- 2");
System.out.println("To Withdraw press----- 3");
System.out.println("For Interest press -- 4");
System.out.println("Exit -- 5");
System.out.println("Please enter a valid choice :");
ych = Integer.parseInt(br.readLine());
switch(ych)
{
case 1:
System.out.println("Enter Name & Address : ");
String name = br.readLine();
String address = br.readLine();
c[i] = new Customer(i,name,address);
c[i++].createAccount(1);
break;
case 2:
System.out.println("Enter Customer Id : ");
id = Integer.parseInt(br.readLine());
c[id].transaction(1);
break;
case 3:
System.out.println("Enter Customer Id : ");
id = Integer.parseInt(br.readLine());
c[id].transaction(2);
break;
case 4:
System.out.println("Enter Customer Id : ");
id = Integer.parseInt(br.readLine());
c[id].transaction(3);
break;
case 5:
break;
default:
System.out.println("Invalid choice");
}
}while(ych != 5);
break;
case 2:
do
{
System.out.println("Opening new Fd Account -- 1");
System.out.println("FD Closing -- 2");
System.out.println("Exit -- 3");
System.out.println("Enter ur choice :");
ych = Integer.parseInt(br.readLine());
switch(ych)
{
case 1:
System.out.println("Enter Name & Address : ");
String name = br.readLine();
String address = br.readLine();
c[i] = new Customer(i,name,address);
c[i].createAccount(2);
i++;
break;
case 2:
System.out.println("Enter Customer Id : ");
id = Integer.parseInt(br.readLine());
c[id].transaction(4);
break;
case 3:
break;
default:
System.out.println("Invalid choice");
}
}while(ych != 3);
break;
case 3:
break;
default :
System.out.println("Invalid choice");
}
}while(op != 3);

}
}




 


