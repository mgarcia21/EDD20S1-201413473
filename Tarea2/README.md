# TAREA 2 / Moneda

_Simulador de Moneda, permite trasnferir dinero entre personas y trasnferir dinero de el monedero hacia los usuarios._

## Metodos🚀

_Se crearon 2 metodos, metodo trasnferir y metodo transferir from._

Mira **Deployment** para conocer como desplegar el proyecto.




### transferir()🔧

_El método transferir(Moneda, int) recibe 2 parametros uno de tipo Moneda y otro de tipo int, este permite trasnferir del monedero a el usuario_


```
    public void transferir(Moneda solicito, double valor){
        solicito.insertar(valor);
        this.monedero -= valor;

    }
```
### transferirFrom()🔧

_El método transferirFrom(Moneda,Moneda, int) recibe 3 parametros dos de tipo Moneda y otro de tipo int, este permite trasnferir de un usuario a otro usuario_


```
    public void transferirFrom(Moneda envio, Moneda otro, double valor){
        envio.retirar(valor);
        otro.insertar(valor);
    }
```

## Metodos Secundarios⚙️

_Se utilizan los siguientes dos métodos para trabajar los métodos transferir y transferiFrom_

```
    public void insertar(double valor){
    saldo = saldo+valor;
    }

    public void retirar(double valor){
        saldo = saldo-valor;
    }
```



## Despliegue 📦

_Tarea del curso de Estructuras de Datos_

## Construido con 🛠️

_JAVA_


## Autores ✒️

_Maynor Garcia- 201413473_








