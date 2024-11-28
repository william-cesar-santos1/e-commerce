package br.ada.ecommerce.usecases.impl.order;

import br.ada.ecommerce.model.Order;
import br.ada.ecommerce.model.OrderStatus;
import br.ada.ecommerce.usecases.order.IOrderPayUseCase;
import org.springframework.stereotype.Service;

@Service
public class OrderPayUseCaseImpl implements IOrderPayUseCase {

    @Override
    public void pay(Order order) {
        if (order.getStatus() != OrderStatus.PENDING_PAYMENT) {
//            throw new RuntimeException("Pedido em estado invalido");
        }
        order.setStatus(OrderStatus.PAID);
    }

}
