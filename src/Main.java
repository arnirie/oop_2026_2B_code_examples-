// Author: Arni-Rie Tamayo
// Date:
// Modified date:
// Purpose:


void main() {
    Scanner sc = new Scanner(System.in);
    short start, end, change;
    start = sc.nextShort();
    end = sc.nextShort();
    change = sc.nextShort();
    if(start < end) {
        for (short c = (short) (start + change); c < end; c += change) {
            System.out.print(c + " ");
        }
    }else {
        for (short c = (short) (start - change); c > end; c -= change) {
            System.out.print(c + " ");
        }
    }
}
