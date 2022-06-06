
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author yisus
 */
public class Compilador extends javax.swing.JFrame {

    private String title;
    private Directory directorio;
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;

    /**
     * Creates new form Compilador
     */
    public Compilador() {
        initComponents();
        init();
    }

    private void init() {
        title = "LEARN+";
        setLocationRelativeTo(null);
        setTitle(title);
        directorio = new Directory(this, jtpCode, title, ".learn+");
        addWindowListener(new WindowAdapter() {// Cuando presiona la "X" de la esquina superior derecha
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit();
                System.exit(0);
            }
        });
     
        Functions.insertAsteriskInName(this, jtpCode, () -> {
            timerKeyReleased.restart();
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        Functions.setAutocompleterJTextComponent(new String[]{"repetir","colorear","quesi","queno","agregar","quitar","separar","adicionX"}, jtpCode, () -> {
            timerKeyReleased.restart();
        });

        Functions.setLineNumberOnJTextComponent(jtpCode); //Pone los numeros de linea
        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();
            
            int posicion = jtpCode.getCaretPosition();
            jtpCode.setText(jtpCode.getText().replaceAll("[\r]+", ""));
            jtpCode.setCaretPosition(posicion);
            
            colorAnalysis();
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        buttonsFilePanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsFilePanelLayout = new javax.swing.GroupLayout(buttonsFilePanel);
        buttonsFilePanel.setLayout(buttonsFilePanelLayout);
        buttonsFilePanelLayout.setHorizontalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsFilePanelLayout.setVerticalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jtpCode);

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjecutar)
                .addContainerGap())
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompilar)
                    .addComponent(btnEjecutar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(255, 255, 255));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Componente léxico", "Lexema", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblTokens);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rootPanelLayout.createSequentialGroup()
                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (directorio.Open()) {
            colorAnalysis();
            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        btnCompilar.doClick();
        if (codeHasBeenCompiled) {
            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se puede ejecutar el código ya que se encontró uno o más errores",
                        "Error en la compilación", JOptionPane.ERROR_MESSAGE);
            } else {
                CodeBlock codeBlock = Functions.splitCodeInCodeBlocks(tokens, "{", "}", ";");
                System.out.println(codeBlock);
                ArrayList<String> blocksOfCode = codeBlock.getBlocksOfCodeInOrderOfExec();
                System.out.println(blocksOfCode);

            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void compile() {
        clearFields();
        lexicalAnalysis();
        fillTableTokens();
        syntacticAnalysis();
        semanticAnalysis();
        printConsole();
        codeHasBeenCompiled = true;

    }
private void mostrarerrores(){
        String e = "COMPILACION TERMINADA...\n\n";
         jtaOutputConsole.setText(e);
        tokens.forEach(token ->{
            if(token.getLexicalComp().equals("ERROR 0")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": El caracter no pertenece al alfabeto, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 1")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": La variable no inicia con una letra, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 2")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": Un carácter del nombre de la variable no pertenece a un símbolo válido, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 3")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": Un carácter de la cadena no pertenece a un símbolo válido, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 4")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": No hay ningún elemento entre ‘ ’, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 5")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": Falto una ‘ en la cadena, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 6")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": Un carácter del nombre del resultado no pertenece a un símbolo válido, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 7")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": No hay por lo menos una letra después de #, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 8")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": Un carácter del nombre del método no pertenece a un símbolo válido, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 9")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": No Hay por lo menos una letra después de &, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 10")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": El número contiene un caracter no valido o cuenta con más de un punto, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 11")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": No contiene un dígito como mínimo después del punto en el número , Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 12")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": El número inicia con punto decimal, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 13")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": El número inicia con punto decimal y tiene más de uno, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }else if(token.getLexicalComp().equals("ERROR 14")){
                 jtaOutputConsole.append("----------> "+token.getLexicalComp()+": El número no inicia con un dígito, Linea ["+token.getLine()+"] Columna ["+token.getColumn()+"]\n");
            }           
        });
    }

    private void lexicalAnalysis() {
        // Extraer tokens
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    break;
                }
                tokens.add(token);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
    }

    private void syntacticAnalysis() {
        Grammar gramatica = new Grammar(tokens, errors);

        
        /*Eliminacion de errores*/
        gramatica.delete(new String[]{"ERROR","ERROR_1","ERROR_2"},1);
        
        /*Agrupacion de valores*/
        gramatica.group("VALOR", "(NUMERO|COLOR)", true);
        
        /*Declaracion de variables*/
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG VALOR", true);

        gramatica.group("VARIABLE", "TIPO_DATO OP_ASIG VALOR", true, 2,
                       "error sintactico{}: falta el >Identificador en la declarion de la variable[#,%]");
        gramatica.finalLineColumn();

        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG", true, 3,
                        "error sintactico {}: falta el valor en la declarion de la variable[#,%]");
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR VALOR", true, 4,
                        "error sintactico {}: falta el Operador de asignacion --> en la declarion de la variable[#,%]");
        gramatica.group("VARIABLE", "IDENTIFICADOR OP_ASIG VALOR", true, 5,
                        "error sintactico {}: falta el Tipo de dato numero|color en la declarion de la variable[#,%]");

        gramatica.initialLineColumn();

        /*Eliminacion de tipos de datos y operaciones de asignacion*/
        gramatica.delete("TIPO_DATO", 6, "Error sintactico {}: el tipo de dato esta en una declaracion [#,%]");
        gramatica.delete("OP_ASIG", 7, "Error sintactico {}: el Operador de asignacion no esta en una declaracion [#,%]");

        /*Agrupar de identificadores*/
        gramatica.group("VALOR", "IDENTIFICADOR", true);
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");// nuestro lenguaje solo acepta un parametro en funcion
    

        /*AGRUPACION DE FUNCIONES*/
        gramatica.group("FUNCION", "(MIENTRAS | INTERRUMPIR | COLOREAR | VER | FUNCION_USUA)", true);

        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)? PARENTESIS_C", true);

        gramatica.group("FUNCION_COMP", "FUNCION (VALOR | PARAMETROS)? PARENTESIS_C", true, 8, 
                        "error sintactico{}: hace falta un parentesis que abre <( en la Funcion[#,%]");

        gramatica.group("FUNCION_COMP", "PARENTESIS_A (VALOR | PARAMETROS)? PARENTESIS_C", true, 9, 
                        "error sintactico{}: hace falta la funcion que deceas llamar ¿FUNCION? en[#,%]");

        gramatica.finalLineColumn();

        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)", true, 10,
                        "error sintactico{}: hace falta un parentesis que cierra )> en la Funcion[#,%]");
        gramatica.initialLineColumn();
        
        /*eliminacion de funciones incompletas*/
        gramatica.delete("FUNCION", 11, "error de sintaxis {}: La funcion no esta declarada correctamente[#,%]");
        
        /*Agrupacion Expreciones logicas*/
        gramatica.loopForFunExecUntilChangeNotDetected(()->{
            gramatica.group("EXP_LOGICA", "(FUNCION_COMP | EXP_LOGICA) (OPE_LOGICO (FUNCION_COMP | EXP_LOGICA))+");
            gramatica.group("EXP_LOGICA", "PARENTESIS_A (EXP_LOGICA | FUNCION_COMP) PARENTESIS_C");
        });
    
        /*ELIMINACION DE OPERADORES LOGICOS*/
        gramatica.delete("OPE_LOGICO", 12, "error sintctico {}: El operador logico no esta contenido en una expresion[#,%]");
        
        /*Agrupacion de exp. logicas como validar y parametros*/
        gramatica.group("VALOR", "EXP_LOGICA");
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");// SI QUISIERAMOS AGREGAR PARA QUE FUERAN MAS PARAMETROS NO SOLO 1 ESCRIBIMOS "VALOR (COMA VALOR)+"

        /*Agrupacion de estructuras de control*/
        gramatica.group("EST_CONTROL", "(REPETIR | EST_QUESI)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A PARENTESIS_C");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL (VALOR | PARAMETROS)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A (VALOR | PARAMETROS) PARENTESIS_C");
       
        /*eliminacion de estructuras de control incompletas*/
        gramatica.delete("EST_CONTROL", 13, "error de sintactico {}: La estructura [] de control esta incompleta(repetir/quesi/queno)[#,%]");

        /*ELIMINACION DE PARENTESIS*/
        gramatica.delete(new String[]{"PARENTESIS_A", "PARENTESIS_C"}, 14, "error sintactico {}: en el parentesis[] no esta contenido en una agrupacion [#,%]");
        
        gramatica.finalLineColumn();
        
        /*verificacion de una BARRA VERTICAL al final de una sentencia*/

        /*Identificadores o Variables*/
        gramatica.group("VARIABLE_PC", "VARIABLE BARRA_VER", true);
        gramatica.group("VARIABLE_PC", "VARIABLE", true, 15, "error sintactico {}: falta la barra vertical[] al final de la variable[#,%]");

        /*funciones*/
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP BARRA_VER");
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP", 16, "error sintactico{}: falta la barra vertical al final de la declaracion de funcion[#,%]");
        
        gramatica.initialLineColumn();

        /*Eliminacion dela barra vertical*/
        gramatica.delete("BARRA_VER", 17, "error sintactico{}: la barra vertical no esta al final de una sentencia[#,%]");

        /*sentencias */
        gramatica.group("SENTENCIAS", "(VARIABLE_PC | FUNCION_COMP_PC)+");

        gramatica.loopForFunExecUntilChangeNotDetected(()->{
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A (SENTENCIAS)? LLAVE_C", true);
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)+");
        });

        /*ESTRUCTURAS DE FUNCION INCOMPLETAS*/
        gramatica.loopForFunExecUntilChangeNotDetected(()->{
            gramatica.initialLineColumn();

            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP (SENTENCIAS)? LLAVE_C", true, 18, "error sintactico{}: Falta la llave que ABRE <{ en la estructura de control[#,%]");
            
            gramatica.finalLineColumn();

            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A SENTENCIAS", true, 19, "error sintactico{}: Falta la llave que CIERRA }> en la estructura de control[#,%]");

            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)");
        });

        gramatica.delete(new String[]{"LLAVE_A", "LLAVE_C"}, 20, "error sintactico {}: la llave[] no esta contenida en una agrupacion[#,%]");

 /* Mostrar gramáticas */
gramatica.show();
    }

    private void semanticAnalysis() {
    }

    private void colorAnalysis() {
        /* Limpiar el arreglo de colores */
        textsColor.clear();
        /* Extraer rangos de colores */
        LexerColor lexerColor;
        try {
            File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexerColor = new LexerColor(entrada);
            while (true) {
                TextColor textColor = lexerColor.yylex();
                if (textColor == null) {
                    break;
                }
                textsColor.add(textColor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
        Functions.colorTextPane(textsColor, jtpCode, new Color(40, 40, 40));
    }

    private void fillTableTokens() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }

    private void printConsole() {
        int sizeErrors = errors.size();
        if (sizeErrors > 0) {
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for (ErrorLSSL error : errors) {
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
        } else {
            jtaOutputConsole.setText("Compilación terminada...");
        }
        jtaOutputConsole.setCaretPosition(0);
    }

    private void clearFields() {
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        codeHasBeenCompiled = false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
                new Compilador().setVisible(true);
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel buttonsFilePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables
}
