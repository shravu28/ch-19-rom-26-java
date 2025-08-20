package com.xworkz.chatsapp.chats;
import com.xworkz.chatsapp.chats.Chats;
public class ChatsRunner {


        public static void main(String[] args) {

            System.out.println("main started");
            Chats chats = new Chats();
            chats.setChatsId(1);
            chats.setChatsName("fiber");
            chats.setPrice(100.00);
            int wireId = chats.getChatsId();
            String wireName=chats.getChatsName();
            double price=chats.getPrice();
            System.out.println("main ended");
        }
    }