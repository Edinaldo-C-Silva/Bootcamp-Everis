## Datas

#### Date()
Objeto da classe Date
Pega a data e hora atual de acordo com o sistema (precisão de milissegundos)

#### Date(long date)
Objeto da classe Date
Espera um valor long int que se refere à data, com base no padrão de tempo epoch
Epoch = padrão de contagem de tempo que conta os milissegundos desde 1/1/1970 às 0:00:00.

### Métodos

#### after(Date) e before(Date)
Testa se a data de referência é anterior/posterior à data comparada (data entre perêntesis). Retorna um boolean

#### compareTo(Date)
Compara dois objetos Data.
Retorna um int com base no resultado. 
Passado = -1
Presente = 0
Futuro = 1

#### equals(Date)
Checa se os objetos são iguais. Retorna um boolean

#### getTime()
Retorna a data em milissegundos

#### setTime(long)
Define uma data com base em milissegundos

#### toInstant()
Pega uma data e formata de uma forma mais legível
Ano-Mes-Dia T Hora-Minuto-Segundo-Milissegundos

#### from(Instante)
Define uma data com base em um instante

#### System.currentTimeMillis()
Retorna o milissegundo mais próximo com base no sistema

## Calendar

#### add(Calendar.UnidadeDeTempo, valor)
Adicicona uma quantidade da unidade de tempo selecionada
Pode ser Dia, Mes ou Ano.
Este método altera o objeto Calendar, portanto as interações são executadas a partir do resultado da anterior

#### getInstance()
Retorna a data e hora atual

#### System.out.printf(formatação, Calendar)
Formata a data de maneiras diferentes
###### %tc = formatação normal
###### %tF = ano-mês-dia
###### %tD = ano/mês/dia
###### %tr = Hora - formato 12h
###### %tT = Hora - formato 24h

## Data no Java 8+

### LocalDate
Classe imutável para representar data
yyyy-MM-dd

#### now()
Retorna a data atual

#### of(ano, mes, dia)
Insere uma data especificada no objeto

#### plusDays(numero) / minusDays(numero)
Soma ou subtrai uma quantidade de dias da data

#### plusMonths(numero) / minusMonths(numero)
Soma ou subtrai uma quantidade de meses da data

#### plusYears(numero) / minusYears(numero)
Soma ou subtrai uma quantidade de anos da data

### LocalTime
Classe imutável que representa uma hora
hh:mm:ss
Pode representar até nanossegundos (9 dígitos de precisão)

#### now()
Retorna a hora atual

#### plusHours / minusHouse(numero)
Adiciona ou subtrai uma quantidade de horas para a hora

#### plusMinutes / minusMinutes(numero)
Adiciona ou subtrai uma quantidade de minutos para a hora

#### plusSeconds / minusSeconds(numero)
Adiciona ou subtrai uma quantidade de segundos para a hora

### LocalDateTime
Uma junção das duas classes anteriores
Classe imutável que trabalha com datas e horas
Manipula data e horas com precisão de até nanossegundos

#### now()
Retorna a data e hora atuais

Os métodos de plus/minus de data e hora funcionam aqui