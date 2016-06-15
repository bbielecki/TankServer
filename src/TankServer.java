/**
 * Created by Bartłomiej on 2016-06-15.
 */

import java.io.*; import java.net.*;
import java.util.Properties;

public class TankServer {
    public static void main(String args[]) {

            ServerSocket serverSocket;
            try {
                serverSocket = new ServerSocket(54321);
            } catch (Exception e) {
                System.err.println("Create server socket: " + e);
                return;
            }

            while (true)
                try {
                    String a = "0", b = "0";
                    Socket socket = serverSocket.accept();
                    InputStream inputStream = socket.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    OutputStream outputStream = socket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(outputStream, true);
                    String fromClient = bufferedReader.readLine();

                    System.out.println(fromClient);

                    if (fromClient.equals("get maplvl1")) {
                        try {
                            File mapFile = new File("maplvl1.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            //System.out.println(a+"   "+b);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                            System.out.println(a+"   "+b);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("get maplvl2")) {
                        try {
                            File mapFile = new File("maplvl2.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("get maplvl3")) {
                        try {
                            File mapFile = new File("maplvl3.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("get maplvl4")) {
                        try {
                            File mapFile = new File("maplvl4.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("get maplvl5")) {
                        try {
                            File mapFile = new File("maplvl5.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("get bestscores")) {     /////// do poprawienia gdy beda bestscorsy
                        try {
                            File mapFile = new File("bestscores.properties");
                            Properties pro = new Properties();
                            FileInputStream fis = new FileInputStream(mapFile);
                            pro.load(fis);
                            a = pro.getProperty("a");
                            b = pro.getProperty("b");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("From client: [" + fromClient + "]");
                        printWriter.println("" + a);
                        printWriter.println("" + b);

                    }

                    if (fromClient.equals("set bestscores")) {     //// no i to tez


                    }

                    socket.close();
                } catch (Exception e) {
                    System.err.println("Server exception: " + e);
                }

        }
    }
