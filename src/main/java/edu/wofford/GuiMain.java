package edu.wofford;


import com.sun.org.apache.xpath.internal.operations.Mod;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class GuiMain extends JFrame implements ActionListener {
    private TicTacToeModel model = new TicTacToeModel();
    private JButton Top_left;
    private JButton Top_mid;
    private JButton Top_right;
    private JButton Mid_left;
    private JButton Mid_mid;
    private JButton Mid_right;
    private JButton Bottom_left;
    private JButton Bottom_mid;
    private JButton Bottom_right;
    private JLabel label;


    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == Top_left) {
            if(model.getMarkAt(0,0) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(0,0);
                TicTacToeModel.Mark mark = model.getMarkAt(0,0);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Top_left.setText("X");
                } else {
                    Top_left.setText("O");
                }
            }
        } else if (event.getSource() == Top_mid) {
            if(model.getMarkAt(0,1) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(0,1);
                TicTacToeModel.Mark mark = model.getMarkAt(0,1);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Top_mid.setText("X");

                } else {
                    Top_mid.setText("O");

                }
            }
        }else if (event.getSource() == Top_right) {
            if(model.getMarkAt(0,2) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(0,2);
                TicTacToeModel.Mark mark = model.getMarkAt(0,2);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Top_right.setText("X");

                } else {
                    Top_right.setText("O");

                }
            }
        } else if (event.getSource() == Mid_left) {
            if(model.getMarkAt(1,0) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(1,0);
                TicTacToeModel.Mark mark = model.getMarkAt(1,0);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Mid_left.setText("X");

                } else {
                    Mid_left.setText("O");

                }
            }
        } else if (event.getSource() == Mid_mid) {
            if(model.getMarkAt(1,1) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(1,1);
                TicTacToeModel.Mark mark = model.getMarkAt(1,1);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Mid_mid.setText("X");

                } else {
                    Mid_mid.setText("O");

                }
            }
        } else if (event.getSource() == Mid_right) {
            if(model.getMarkAt(1,2) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(1,2);
                TicTacToeModel.Mark mark = model.getMarkAt(1,2);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Mid_right.setText("X");

                } else {
                    Mid_right.setText("O");

                }
            };
        } else if (event.getSource() == Bottom_left) {
            if(model.getMarkAt(2,0) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(2, 0);
                TicTacToeModel.Mark mark = model.getMarkAt(2,0);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Bottom_left.setText("X");

                } else {
                    Bottom_left.setText("O");

                }
            }
        } else if (event.getSource() == Bottom_mid) {
            if(model.getMarkAt(2,1) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(2,1);
                TicTacToeModel.Mark mark = model.getMarkAt(2,1);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Bottom_mid.setText("X");
                    label.setText("" + model.getResult());
                } else {
                    Bottom_mid.setText("O");

                }
            }
        } else if (event.getSource() == Bottom_right) {
            if(model.getMarkAt(2,2) == TicTacToeModel.Mark.EMPTY) {
                model.setMarkAt(2,2);
                TicTacToeModel.Mark mark = model.getMarkAt(2,2);
                if (mark == TicTacToeModel.Mark.XMARK) {
                    Bottom_right.setText("X");

                } else {
                    Bottom_right.setText("O");

                }
            }
        }
        if (model.getResult() == TicTacToeModel.Result.XWIN) {
            label.setText("X wins");
        }
        if (model.getResult() == TicTacToeModel.Result.OWIN) {
            label.setText("O wins");
        }
        if (model.getResult() == TicTacToeModel.Result.TIE) {
            label.setText("Tie");
        }

    }
    
    public GuiMain() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        label = new JLabel();
        label.setName("result");
        label.setText(" ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        Top_left = new JButton();
        Top_left.setName("location00");
        Top_left.addActionListener(this);
        content.add(Top_left);

        Top_mid = new JButton();
        Top_mid.setName(("location01"));
        Top_mid.addActionListener(this);
        content.add(Top_mid);


        Top_right = new JButton();
        Top_right.setName("location02");
        Top_right.addActionListener(this);
        content.add(Top_right);


        Mid_left = new JButton();
        Mid_left.setName("location10");
        Mid_left.addActionListener(this);
        content.add(Mid_left);


        Mid_mid = new JButton();
        Mid_mid.setName("location11");
        Mid_mid.addActionListener(this);
        content.add(Mid_mid);


        Mid_right = new JButton();
        Mid_right.setName("location12");
        Mid_right.addActionListener(this);
        content.add(Mid_right);


        Bottom_left = new JButton();
        Bottom_left.setName("location20");
        Bottom_left.addActionListener(this);
        content.add(Bottom_left);


        Bottom_mid = new JButton();
        Bottom_mid.setName("location21");
        Bottom_mid.addActionListener(this);
        content.add(Bottom_mid);


        Bottom_right = new JButton();
        Bottom_right.setName("location22");
        Bottom_right.addActionListener(this);
        content.add(Bottom_right);

        content.setLayout(new GridLayout(3,3));
        setLayout(new BorderLayout());
        add(label,BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        this.add(content, BorderLayout.CENTER);

        pack();
    }


	public static void main(String[] args) {
        GuiMain frame = new GuiMain();
        frame.setSize(500,500);
        frame.setVisible(true);

	}
}