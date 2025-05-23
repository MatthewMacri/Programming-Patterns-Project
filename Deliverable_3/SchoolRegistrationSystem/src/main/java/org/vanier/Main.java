package org.vanier;

import org.vanier.controller.DatabaseController;
import org.vanier.view.MainForm;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Set Look and Feel to system default for better appearance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeel());
        } catch (Exception e) {
            System.err.println("Could not set system look and feel: " + e.getMessage());
        }

        // Use SwingUtilities.invokeLater for thread safety
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        try {
            MainForm mainForm = new MainForm();
            
            // Set up the JFrame properties with better configuration
            JFrame frame = new JFrame("Main Application - Vanier");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(mainForm.getContentPane());
            
            // Center the window on screen
            frame.pack();
            frame.setLocationRelativeTo(null);
            
            // Set minimum size to prevent too small window
            frame.setMinimumSize(new Dimension(400, 300));
            
            frame.setVisible(true);

            // Initialize database after GUI is created
            initializeDatabase();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Error starting application: " + e.getMessage(), 
                "Startup Error", 
                JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private static void initializeDatabase() {
        try {
            DatabaseController.deleteTables();
            System.out.println("Database tables cleared successfully.");
        } catch (Exception e) {
            System.err.println("Database initialization error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, 
                "Database initialization failed: " + e.getMessage(), 
                "Database Error", 
                JOptionPane.WARNING_MESSAGE);
        }
    }
}