#M8 身分證字號檢查
設計一個程式可以檢查身分證字號的正確性。檢查號碼的規則如下

|A1|N1|N1|N3|N4|N5|N6|N7|N8|N9|
|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|
||1/男<br>2/女|||||||||

字母對照表如下：
<table >
<tr align="center"><td>字母</td><td>A</td><td>B</td><td>C</td><td>D</td><td>E</td><td>F</td><td>G</td><td>H</td><td>J</td><td>K</td><td>L</td><td>M</td><td>N
</td></tr><tr><td>數字</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td><td>21</td><td>22
</td></tr><tr align="center"><td>字母</td><td>P</td><td>Q</td><td>R</td><td>S</td><td>T</td><td>U</td><td>V</td><td>X</td><td>Y</td><td>W</td><td>Z</td><td>I</td><td>O
</td></tr><tr><td>數字</td><td>23</td><td>24</td><td>25</td><td>26</td><td>27</td><td>28</td><td>29</td><td>30</td><td>31</td><td>32</td><td>33</td><td>34</td><td>35
</td></tr></table>

令其代號 A1 之十位數為 X1，個位數為 X2，例如 Y 的代號 31， X1=3，X2=1<br>
計算公式為： <br>
Y=X1+9×X2+8×A1+7×A2+6×A3+5×A4+4×A5+3×A6+2×A7+A8+A9
如果 Y 可以被 10 整除則此身分證號碼是對的，否則是錯的。 <br>
例如: <br>
輸入身分證字號：T112663836 <br>
2+7\*9 + 1\*8 + 1\*7 + 2\*6 + 6\*5 + 6\*4 + 3\*3 + 8\*2 + 3\*1 + 6 = 180 <br>
180  除以  10 整除，因此為符合規則的號碼
#
輸入範例：
```
輸入身分證字號：T112663836
```
輸出範例：
```
此身分證字號為 真!
```
