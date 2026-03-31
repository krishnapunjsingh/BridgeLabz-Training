import java.util.Scanner;

class StudentNode{
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;
    StudentNode(int rollNo, String name, int age, char grade){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList{
    private StudentNode head;

    public void addAtBeginning(int rollNo, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int rollNo, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if(head == null){
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addAtPosition(int position, int rollNo, String name, int age, char grade){
        if(position <= 1){
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for(int i=1;i< position-1 && temp!=null; i++){
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteByRollNumber(int rollNo){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            System.out.println("Student deleted SuccessFully");
            return;
        }
        StudentNode temp = head;
        while(temp.next != null && temp.next.rollNo != rollNo){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Student Not found");
        }
        else{
            temp.next = temp.next.next;
            System.out.println("Studemt deleted successfully");
        }

    }
    public void searchByRollNo(int rollNo){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNo == rollNo){
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student Not Found");    
    }
    public void updateGrade(int rollNo, char newGrade){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNo == rollNo){
                temp.grade = newGrade;
                System.out.println("Grade update Successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student Not Found");
    }
    public void displayAll(){
        if(head == null){
            System.out.println("No Student record found");
        }
        StudentNode temp = head;
        while(temp!= null){
            displayStudent(temp);
            temp = temp.next;
        }
    }
    private void displayStudent(StudentNode s){
        System.out.println("Roll No: " + s.rollNo + " , Name: " + s.name + " , Age: " + s.age + " , Grade: " + s.grade);
    }

}
public class StudentRecordManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;
        do {
             System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                case 2:
                case 3:
                    System.out.println("Enter roll no: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    if(choice == 1){
                        list.addAtBeginning(roll,name,age,grade);

                    }
                    else if(choice ==2){
                        list.addAtEnd(roll, name , age, grade);
                    }
                    else{
                        System.out.print("Enter position ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, roll , name, age, grade);
                    }
                    break;
                case 4:
                     System.out.print("Enter Roll No to delete: ");
                     list.deleteByRollNumber(sc.nextInt());
                     break;
                case 5:
                    System.out.println("Enter roll no to search: ");
                    list.searchByRollNo(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    System.out.print("Enter new Grade: ");
                    char g = sc.next().charAt(0);
                    list.updateGrade(r , g);
                    break;
                 case 7:
                    list.displayAll();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    
            }
        } while(choice != 0);

    }
}
