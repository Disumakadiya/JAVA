// import java.util.concurrent.locks.ReentrantLock;

// public class Task12 {
//     public static void main(String[] args) throws InterruptedException {
//         BankAccount account = new BankAccount(1000.0);

//         Runnable task = () -> {
//             for (int i = 0; i < 5; i++) {
//                 double depositAmount = 100 + Math.random() * 100;
//                 account.deposit(depositAmount);
//                 System.out.println(Thread.currentThread().getName() + " deposited: " + depositAmount + ", Balance: " + account.getBalance());

//                 double withdrawAmount = 50 + Math.random() * 50;
//                 account.withdraw(withdrawAmount);
//                 System.out.println(Thread.currentThread().getName() + " withdrew: " + withdrawAmount + ", Balance: " + account.getBalance());
//             }
//         };

//         Thread t1 = new Thread(task, "Thread-1");
//         Thread t2 = new Thread(task, "Thread-2");
//         Thread t3 = new Thread(task, "Thread-3");

//         t1.start();
//         t2.start();
//         t3.start();

//         t1.join();
//         t2.join();
//         t3.join();

//         System.out.println("Final balance: " + account.getBalance());
//     }
// }

// class BankAccount {
//     private double balance;
//     private final ReentrantLock lock = new ReentrantLock();

//     public BankAccount(double initialBalance) {
//         this.balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         lock.lock();
//         try {
//             if (amount > 0) {
//                 balance += amount;
//             }
//         } finally {
//             lock.unlock();
//         }
//     }

//     public void withdraw(double amount) {
//         lock.lock();
//         try {
//             if (amount > 0 && balance >= amount) {
//                 balance -= amount;
//             }
//         } finally {
//             lock.unlock();
//         }
//     }

//     public double getBalance() {
//         lock.lock();
//         try {
//             return balance;
//         } finally {
//             lock.unlock();
//         }
//     }
// }
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount +
                    " but insufficient balance! Current: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class BankingTask implements Runnable {
    private BankAccount account;

    public BankingTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {  // repeat a few times
            account.deposit(100);
            account.withdraw(50);

            try {
                Thread.sleep(200); // simulate some processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance

        // Create at least 3 threads
        Thread t1 = new Thread(new BankingTask(account), "Thread-1");
        Thread t2 = new Thread(new BankingTask(account), "Thread-2");
        Thread t3 = new Thread(new BankingTask(account), "Thread-3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance
        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}
