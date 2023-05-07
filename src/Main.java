import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e1) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e2) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e3) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e4) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e1) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e2) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e3) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e4) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException e1) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e2) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e3) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e4) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e1) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e2) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e3) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e4) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e1) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e2) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e3) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e4) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}
