import pyautogui as p
import time

p.PAUSE = 2
p.press('win')
p.write('desabilitarEthernet.bat')
p.press('backspace')
p.press('enter')
time.sleep(5)
p.press('win')
p.write('habilitarEthernet.bat')
p.press('backspace')
p.press('enter')




p.FAILSAFE = False
