package frame;
import Book.BookList;
import Operation.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame extends Thread {
    int x;
    int y;
    BookList bookList = new BookList();
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    JFrame f1 = new JFrame("Library Management System");//主页
    JFrame f2 = new JFrame("Library Management System");//管理员
    JFrame f3 = new JFrame("Library Management System");//游客
    JFrame f4 = new JFrame("Library Management System");//查找页面
    JFrame f5 = new JFrame("Library Management System");//添加页面
    JFrame f6 = new JFrame("Library Management System");//删除页面
    JFrame f7 = new JFrame("Library Management System");//展示页面
    JFrame f8 = new JFrame("Library Management System");//查找页面（访客）
    JFrame f9 = new JFrame("Library Management System");//借出页面（访客）
    JFrame f10 = new JFrame("Library Management System");//归还页面（访客）
    JMenuBar jMenuBar = new JMenuBar();
    JMenu function = new JMenu("Function");
    JMenu about = new JMenu("About");
    JMenuItem search = new JMenuItem("Search");
    JMenuItem infor = new JMenuItem("Information");
    JButton back = new JButton("Back");
    JButton back1 = new JButton("Back");
    JButton back3 = new JButton("Back");
    JButton b1 = new JButton("Admin");
    JButton b2 = new JButton("Normal");
    JButton b3 = new JButton("Search Book");
    JButton b4 = new JButton("Add Book");
    JButton b5 = new JButton("Delete Book");
    JButton b6 = new JButton("Show Book");
    JButton b11 = new JButton("Search");
    JButton b12 = new JButton("Borrow");
    JButton b13 = new JButton("Return");
    JTextField t1 = new JTextField();//姓名
    JTextField t2 = new JTextField();//搜索
    JTextField t3 = new JTextField();//添加
    JTextField t4 = new JTextField();//添加
    JTextField t5 = new JTextField();//添加
    JTextField t6 = new JTextField();//添加
    JTextField t7 = new JTextField();//删除
    JTextField t8 = new JTextField();
    JTextField t9 = new JTextField();
    JTextField t10 = new JTextField();

    JLabel L1 = new JLabel("Welcome Library Management System");//欢迎语
    JTextArea L2 = new JTextArea("");//图书搜索结果
    JLabel L3 = new JLabel("Name of book:");
    JLabel L4 = new JLabel("Author of book:");
    JLabel L5 = new JLabel("Price of book:");
    JLabel L6 = new JLabel("Type of book:");
    JLabel L7 = new JLabel("The book you want to delete");
    JTextArea L8 = new JTextArea();//图书展示结果
    JTextArea L9 = new JTextArea("");//图书搜索结果
    JTextArea L10 = new JTextArea("");//借出结果
    JTextArea L11 = new JTextArea("");//归还结果
    JScrollPane j = new JScrollPane(L8);
    Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 20);//字体

    @Override
    public void run() {
        frame1();
    }

    public void frame1() {//主页面
        window();
        f1.setLocation(x, y);
        f1.setSize(500, 400);
        f1.setLayout(null);
        function.add(search);
        about.add(infor);
        jMenuBar.add(function);
        jMenuBar.add(about);
        f1.setJMenuBar(jMenuBar);
        button_admin_start();
        button_norm_start();
        Text1();
        Label1();
        f1.setVisible(true);
    }

    public void admin() {//管理员系统
        f2.setLocation(x, y);
        f2.setSize(500, 400);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
        button_admin_search();
        button_admin_add();
        button_admin_delete();
        button_admin_show();
        back2(f2);
        f2.setVisible(true);
        f2.setJMenuBar(jMenuBar);
    }

    public void norm() {//普通人系统
        f3.setLocation(x, y);
        f3.setSize(500, 400);
        f3.setLayout(null);
        f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);
        back2(f3);
        button_norm_return();
        button_norm_search();
        button_norm_borrow();
        f3.setVisible(true);
        f3.setJMenuBar(jMenuBar);
    }

    public void search_book() {//查找（管理员）
        f4.setLocation(x, y);
        f4.setSize(500, 400);;
        f4.setLayout(null);
        f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);
        Text2();
        button_admin_search_switch();
        Label2();
        back1(f4);
        f4.setVisible(true);
        f4.setJMenuBar(jMenuBar);
    }

    public void add_book() {//添加（管理员）
        f5.setLocation(x, y);
        f5.setSize(500, 400);;
        f5.setLayout(null);
        f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);
        Text3();
        Text4();
        Text5();
        Text6();
        Label3();
        Label4();
        Label5();
        Label6();
        button_admin_add_switch();
        back1(f5);
        f5.setVisible(true);
        f5.setJMenuBar(jMenuBar);
    }

    public void delete_book() {//删除（管理员）
        f6.setLocation(x, y);
        f6.setSize(500, 400);
        f6.setLayout(null);
        f6.setDefaultCloseOperation(f6.EXIT_ON_CLOSE);
        back1(f6);
        Label7();
        Text7();
        button_admin_delete_switch();
        f6.setVisible(true);
        f6.setJMenuBar(jMenuBar);
    }
    public void show_book() {//展示（管理员）
        f7.setLocation(x, y);
        f7.setSize(500, 400);
        f7.setLayout(null);
        f7.setDefaultCloseOperation(f7.EXIT_ON_CLOSE);
        back1(f7);
        button_admin_show_switch();
        Label8();
        f7.setVisible(true);
        f7.setJMenuBar(jMenuBar);
    }
    public void search_book1() {//查找图书（访客）
        f8.setLocation(x, y);
        f8.setSize(500, 400);
        f8.setLayout(null);
        f8.setDefaultCloseOperation(f8.EXIT_ON_CLOSE);
        Text8();
        button_norm_search_switch();
        Label9();
        back3(f8);
        f8.setVisible(true);
        f8.setJMenuBar(jMenuBar);
    }
    public void borrow_book() {//借出（访客）
        f9.setLocation(x, y);
        f9.setSize(500, 400);
        f9.setLayout(null);
        f9.setDefaultCloseOperation(f9.EXIT_ON_CLOSE);
        Text9();
        button_norm_borrow_switch();
        Label10();
        back3(f9);
        f9.setVisible(true);
        f9.setJMenuBar(jMenuBar);
    }
    public void return_book() {//归还（访客）
        f10.setLocation(x, y);
        f10.setSize(500, 400);
        f10.setLayout(null);
        f10.setDefaultCloseOperation(f10.EXIT_ON_CLOSE);
        Text10();
        button_norm_return_switch();
        Label11();
        back3(f10);
        f10.setVisible(true);
        f10.setJMenuBar(jMenuBar);
    }

    public void back1(JFrame first) {//返回管理
        back.setBounds(300, 300, 120, 20);
        first.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first.setVisible(false);
                admin();
            }
        });
    }
    public void back2(JFrame first) {//返回主页面
        back1.setBounds(300, 300, 120, 20);
        first.add(back1);
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first.setVisible(false);
                frame1();
            }
        });
    }
    public void back3(JFrame first) {//返回游客菜单
        back3.setBounds(300, 300, 120, 20);
        first.add(back3);
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first.setVisible(false);
                norm();
            }
        });
    }

    public void button_admin_start() {//管理员
        b1.setBounds(50, 200, 120, 20);
        f1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin();
                System.out.println(t1.getText());
                f1.setVisible(false);
            }
        });
    }

    public void button_norm_start() {//游客
        b2.setBounds(300, 200, 120, 20);
        f1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                norm();
                System.out.println(t1.getText());
                f1.setVisible(false);
            }
        });
    }

    public void button_admin_search() {//查找（管理员）
        b3.setBounds(150, 50, 120, 20);
        f2.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search_book();
                f2.setVisible(false);
            }
        });
    }

    public void button_admin_add() {//添加（管理员）
        b4.setBounds(150, 100, 120, 20);
        f2.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add_book();
                f2.setVisible(false);
            }
        });
    }

    public void button_admin_delete() {//删除（管理员）
        b5.setBounds(150, 150, 120, 20);
        f2.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete_book();
                f2.setVisible(false);
            }
        });
    }

    public void button_admin_show() {//展示（管理员）
        b6.setBounds(150, 200, 120, 20);
        f2.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show_book();
                f2.setVisible(false);
            }
        });
    }

    public void button_admin_search_switch() {//搜索开关查找书（管理员）
        JButton b7 = new JButton("Search");
        Find find = new Find();
        b7.setBounds(300, 100, 80, 20);
        f4.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L2.setText(find.work(bookList, t2.getText()));
            }
        });
    }

    public void button_admin_add_switch() {//添加书（管理员）
        JButton b8 = new JButton("Add");
        Add add = new Add();
        b8.setBounds(250, 230, 80, 20);
        f5.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.work(bookList, t3.getText(), t4.getText(), Integer.valueOf(t5.getText()), t6.getText());
            }
        });
    }
    public void button_admin_delete_switch() {//删除书（管理员）
        JButton b9 = new JButton("Delete");
        Delete delete =new Delete();
        b9.setBounds(300, 100, 80, 20);
        f6.add(b9);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete.work(bookList,t7.getText());
            }
        });
    }
    public void button_admin_show_switch() {//展示书（管理员）
        JButton b10 = new JButton("Show");
        Show show = new Show();
        b10.setBounds(320, 250, 80, 20);
        f7.add(b10);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L8.setText(show.work(bookList,true));
            }
        });
    }
    public void button_norm_search() {//查找（访客）
        b11.setBounds(150, 50, 120, 20);
        f3.add(b11);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search_book1();
                f3.setVisible(false);
            }
        });
    }

    public void button_norm_borrow() {//借出（访客）
        b12.setBounds(150, 100, 120, 20);
        f3.add(b12);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrow_book();
                f3.setVisible(false);
            }
        });
    }

    public void button_norm_return() {//归还（访客）
        b13.setBounds(150, 150, 120, 20);
        f3.add(b13);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                return_book();
                f3.setVisible(false);
            }
        });
    }
    public void button_norm_search_switch() {//搜索开关查找书（访客）
        JButton b7 = new JButton("Search");
        Find find = new Find();
        b7.setBounds(300, 100, 80, 20);
        f8.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L9.setText(find.work(bookList, t8.getText()));
            }
        });
    }
    public void button_norm_borrow_switch() {//搜索开关查找书（访客）
        JButton b14 = new JButton("Borrow");
        Borrow borrow = new Borrow();
        b14.setBounds(300, 100, 80, 20);
        f9.add(b14);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L10.setText(borrow.work(bookList,t9.getText()));

            }
        });
    }
    public void button_norm_return_switch() {//搜索开关查找书（访客）
        JButton b15 = new JButton("Return");
        Return Return1 = new Return();
        b15.setBounds(300, 100, 80, 20);
        f10.add(b15);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L11.setText(Return1.work(bookList,t10.getText()));
            }
        });
    }


    public void Text1() {
        t1.setText("");
        t1.setBounds(140, 150, 200, 20);
        f1.add(t1);
        t1.addActionListener(t1.getAction());
        t1.selectAll();
    }

    public void Text2() {
        t2.setText("");
        t2.setBounds(90, 100, 200, 20);
        f4.add(t2);
        t2.addActionListener(t2.getAction());
        t2.selectAll();
    }

    public void Text3() {
        t3.setText("");
        t3.setBounds(90, 50, 200, 20);
        f5.add(t3);
        t3.addActionListener(t3.getAction());
        t3.selectAll();
    }

    public void Text4() {
        t4.setText("");
        t4.setBounds(90, 100, 200, 20);
        f5.add(t4);
        t4.addActionListener(t4.getAction());
        t4.selectAll();
    }

    public void Text5() {
        t5.setText("");
        t5.setBounds(90, 150, 200, 20);
        f5.add(t5);
        t5.addActionListener(t5.getAction());
        t5.selectAll();
    }

    public void Text6() {
        t6.setText("");
        t6.setBounds(90, 200, 200, 20);
        f5.add(t6);
        t6.addActionListener(t6.getAction());
        t6.selectAll();
    }
    public void Text7() {
        t7.setText("");
        t7.setBounds(90, 100, 200, 20);
        f6.add(t7);
        t7.addActionListener(t7.getAction());
        t7.selectAll();
    }
    public void Text8() {
        t8.setText("");
        t8.setBounds(90, 100, 200, 20);
        f8.add(t8);
        t8.addActionListener(t8.getAction());
        t8.selectAll();
    }
    public void Text9() {
        t9.setText("");
        t9.setBounds(90, 100, 200, 20);
        f9.add(t9);
        t9.addActionListener(t9.getAction());
        t9.selectAll();
    }
    public void Text10() {
        L9.setText("");
        t10.setBounds(90, 100, 200, 20);
        f10.add(t10);
        t10.addActionListener(t10.getAction());
        t10.selectAll();
    }

    public void Label1() {
        L1.setBounds(75, 20, 500, 50);
        L1.setFont(font);
        f1.add(L1);

    }


    public void Label2() {//查找图书搜索结果（管理员）
        L2.setText("");
        L2.setBounds(80, 140, 300, 50);
        L2.setLineWrap(true);
        f4.add(L2);
    }

    public void Label3() {//添加（管理员）
        L3.setBounds(90, 20, 300, 50);
        f5.add(L3);

    }

    public void Label4() {//添加（管理员）
        L4.setBounds(90, 70, 300, 50);
        f5.add(L4);

    }

    public void Label5() {//添加（管理员）
        L5.setBounds(90, 120, 300, 50);
        f5.add(L5);

    }

    public void Label6() {//添加（管理员）
        L6.setBounds(90, 170, 300, 50);
        f5.add(L6);

    }
    public void Label7() {//删除（管理员）
        L7.setBounds(90, 70, 300, 50);
        f6.add(L7);

    }
    public void Label8(){
        L8.setText("");
        L8.setLineWrap(true);
        L8.setEditable(false);
        j.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        j.setBounds(40, 40, 400, 210);
        f7.add(j);
    }
    public void Label9() {//查找图书搜索结果（管理员）
        L9.setText("");
        L9.setBounds(80, 140, 300, 50);
        L9.setLineWrap(true);
        f8.add(L9);
    }
    public void Label10() {//查找图书搜索结果（管理员）
        L10.setText("");
        L10.setBounds(80, 140, 300, 50);
        L10.setLineWrap(true);
        f9.add(L10);
    }
    public void Label11() {//查找图书搜索结果（管理员）
        L11.setText("");
        L11.setBounds(80, 140, 300, 50);
        L11.setLineWrap(true);
        f10.add(L11);
    }


    public void window() {//居中设置
        int windowWidth = 500; //获得窗口宽
        int windowHeight = 400; //获得窗口高
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        x = screenWidth / 2 - windowWidth / 2;
        y = screenHeight / 2 - windowHeight / 2;
    }

}