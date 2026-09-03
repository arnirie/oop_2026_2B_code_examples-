// Author: Arni-Rie Tamayo
// Date:
// Modified date:
// Purpose:


void main() {
    Scanner sc = new Scanner(System.in);
    short numCyl = sc.nextShort();
    double amount = numCyl * 13.45;
    if(amount > 200) amount += amount * 0.06;
    numCyl += numCyl / 4;
    System.out.println(amount);
    System.out.println(numCyl);
}
