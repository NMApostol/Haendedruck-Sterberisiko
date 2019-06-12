package at.spengergasse;

import com.sun.tools.javac.util.Convert;

public class MainWindow{

        private void AuswertungButton_Click(object sender, RoutedEventArgs e)
        {
            double handedruck = Convert.ToDouble(druckstaerkeTextBox.Text);

            int alter = Convert.ToInt32(alterTextBox.Text);
            int groesse = Convert.ToInt32(groesseTextBox.Text);

            if (alter >= 17 && alter <= 19)
            {
                if (groesse >= 150 && groesse <= 154)
                {
                    if (handedruck <= 21.6)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 155 && groesse <= 159)
                {
                    if (handedruck <= 22.9)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 160 && groesse <= 164)
                {
                    if (handedruck <= 24.0)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 165 && groesse <= 169)
                {
                    if (handedruck <= 25.0)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 170 && groesse <= 174)
                {
                    if (handedruck <= 26.0)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 175 && groesse <= 179)
                {
                    if (handedruck <= 26.7)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 180 && groesse <= 184)
                {
                    if (handedruck <= 27.6)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
            }
            else if (alter >= 20 && alter <= 24)
            {
                if (groesse >= 150 && groesse <= 154)
                {
                    if (handedruck <= 23.7)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 155 && groesse <= 159)
                {
                    if (handedruck <= 24.8)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 160 && groesse <= 164)
                {
                    if (handedruck <= 26.1)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 165 && groesse <= 169)
                {
                    if (handedruck <= 27.1)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 170 && groesse <= 174)
                {
                    if (handedruck <= 28.0)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 175 && groesse <= 179)
                {
                    if (handedruck <= 29.0)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
                else if (groesse >= 180 && groesse <= 184)
                {
                    if (handedruck <= 29.6)
                        sterberisikoTextBlock.Text = "Sehr hoch";
                    else { sterberisikoTextBlock.Text = "Niedrig"; }
                }
            }
        }
}
